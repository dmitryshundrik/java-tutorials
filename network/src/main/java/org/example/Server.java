package org.example;

import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Алгоритм работы системы клиент-сервер:
 * 1. Сервер подключается к порту на хосте и ждет соединения с клиентом;
 * 2. Клиент создает сокет и пытается соединить его с портом на хосте;
 * 3. Если создание сокета прошло успешно, то сервер переходит в режим ожидания команд от клиента;
 * 4. Клиент формирует команду и передает ее серверу, переходит в режим ожидания ответа;
 * 5. Сервер принимает команду, выполнеят ее и пересылает ответ клиенту.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /* Серверсокет прослушивает порт 8080 */
        ServerSocket server = new ServerSocket(8080);
        /* Серверсокет ожидает подключения */
        Socket accept = server.accept();
        /* Создание поток ввода/вывода после поключения */
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        bufferedReader.lines().forEach(System.out::println);

        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);
        httpServer.createContext("/");
        httpServer.start();
    }
}