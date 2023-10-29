/*Реализовать секундомер на в любой парадигме. Секундомер должен поддерживать следующий функционал:
○ Запуск
○ Пауза
○ Выход из паузы
○ Остановка
 */

 public class Stopwatch {
    private long startTime;  // время начала отсчета
    private long pauseTime;  // время паузы
    private boolean isRunning;  // флаг на запуск секундомера

    public Stopwatch() {
        startTime = 0;
        pauseTime = 0;
        isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void pause() {
        if (isRunning) {
            pauseTime = System.currentTimeMillis();
            isRunning = false;
            System.out.println("Stopwatch paused.");
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public void resume() {
        if (!isRunning) {
            long pauseDuration = System.currentTimeMillis() - pauseTime;
            startTime += pauseDuration;
            isRunning = true;
            System.out.println("Stopwatch resumed.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            isRunning = false;
            System.out.println("Stopwatch stopped. Elapsed time: " + elapsedTime / 1000 + " seconds");
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.pause();
        stopwatch.resume();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.stop();
    }
}

/*Используется процедурная парадигма.
Код содержит класс Stopwatch, который предоставляет методы для управления секундомером (start, pause, 
resume, stop) и содержит внутренние переменные для хранения времени начала отсчета, времени паузы и флага состояния секундомера. 
Каждый метод выводит соответствующее сообщение о текущем состоянии секундомера.

Демонстрация работы секундомера показана в методе main(), где создается экземпляр класса Stopwatch, 
запускается, делается пауза, затем продолжается работа и наконец останавливается с выводом общего времени работы секундомера.*/