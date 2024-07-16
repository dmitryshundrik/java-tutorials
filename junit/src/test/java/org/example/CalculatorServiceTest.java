package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
    private CalculatorService service1;

    @Mock
    private AdvancedCalculatorService advancedCalculatorService;

    @Before
    public void init() {
        service1 = new CalculatorService(advancedCalculatorService);
    }

    @Test(expected = NullPointerException.class)
    public void testCalculateFail() {
        service1.calculate(null);
    }

    @Test
    public void testCalculateSuccess() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        Mockito.when(advancedCalculatorService.getValue5()).thenReturn(5);
        Integer calculate = service1.calculate(hashSet);
        verify(advancedCalculatorService, times(1)).getValue5();
        Assert.assertEquals(Integer.valueOf(11), calculate);
    }
}