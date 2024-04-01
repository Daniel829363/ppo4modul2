/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.io.File;

public class FileSizeCalculator {

    public static void main(String[] args) {
        String directoryPath = "D://Документы//ППО 4//files";

        // Вызываем метод, чтобы вычислить общий размер файлов в каталоге
        long totalSize = calculateTotalSize(new File(directoryPath));
        System.out.println("Общий размер файлов в каталоге: " + totalSize + " байт");

        // Выводим список всех файлов и каталогов в указанном каталоге с их размером
        listFilesAndDirectories(new File(directoryPath));
    }

    public static long calculateTotalSize(File directory) {
        long totalSize = 0;

        // Получаем список всех файлов и каталогов в каталоге
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Если файл, то прибавляем его размер
                    totalSize += file.length();
                } else if (file.isDirectory()) {
                    // Если каталог, вызываем рекурсивно этот метод для подсчета размера его содержимого
                    totalSize += calculateTotalSize(file);
                }
            }
        }
        return totalSize;
    }

    public static void listFilesAndDirectories(File directory) {
        // Получаем список всех файлов и каталогов в каталоге
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Если файл, выводим его имя и размер
                    System.out.println("Файл: " + file.getName() + " (" + file.length() + " байт)");
                } else if (file.isDirectory()) {
                    // Если каталог, вызываем рекурсивно этот метод для вывода его содержимого
                    System.out.println("Каталог: " + file.getName());
                    listFilesAndDirectories(file);
                }
            }
        }
    }
}

