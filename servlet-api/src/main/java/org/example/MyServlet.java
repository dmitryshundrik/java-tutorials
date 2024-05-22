package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Параметр loadOnStartup позволяет регулировать этапы инициализации сервлета, по умолчанию значение -1
 * то есть инициализация по запросу
 */
@WebServlet(urlPatterns = "/home", name = "MyServlet", loadOnStartup = 0)
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.getWriter().println("ID = " + id);
    }

    /**
     * Жизненный цикл сервлета:
     * 1. Контейнер вызывает метод init(). Этот метод инициализирует сервлет и вызывается в первую очередь, до того, как
     * сервлет сможет обслуживать запросы. За весь жизненный цикл метод init() вызывается только один раз.
     * 2. Обслуживание клиентского запроса. Каждый запрос обрабатывается в своём отдельном потоке. Контейнер вызывает метод
     * service() для каждого запроса.
     * 3. В случае если контейнеру необходимо удалить сервлет, он вызывает метод destroy(), который снимает сервлет из
     * эксплуатации. Этот метод тоже вызывается единожды за весь цикл сервлета.
     */

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
