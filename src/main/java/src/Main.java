package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder StringBuilder = new StringBuilder();

        File src = new File("E://Games/src");
        File res = new File("E://Games/res");
        File saveGames = new File("E://Games/savegames");
        File temp = new File("E://Games/temp");
        File main = new File("E://Games/src/main");
        File test = new File("E://Games/src/test");

        if (src.mkdir()) {
            StringBuilder.append("Каталог src создан \n");
        } else {
            StringBuilder.append("Каталог src не создан \n");
        }

        if (res.mkdir()) {
            StringBuilder.append("Каталог res создан \n");
        } else {
            StringBuilder.append("Каталог res не создан \n");
        }

        if (saveGames.mkdir()) {
            StringBuilder.append("Каталог saveGames создан \n");
        } else {
            StringBuilder.append("Каталог saveGames не создан \n");
        }

        if (temp.mkdir()) {
            StringBuilder.append("Каталог temp создан \n");
        } else {
            StringBuilder.append("Каталог temp не создан \n");
        }

        if (main.mkdir()) {
            StringBuilder.append("Каталог main создан \n");
        } else {
            StringBuilder.append("Каталог main не создан \n");
        }

        if (test.mkdir()) {
            StringBuilder.append("Каталог test создан \n");
        } else {
            StringBuilder.append("Каталог test не создан \n");
        }

        File mainJava = new File("E://Games/src/main/main.java");
        File utils = new File("E://Games/src/main/utils.java");
        try {
            if (mainJava.createNewFile()) StringBuilder.append("Файл mainJava был создан \n");
            else StringBuilder.append("Файл mainJava не был создан \n");
            if (utils.createNewFile()) StringBuilder.append("Файл utils был создан \n");
            else StringBuilder.append("Файл utils не был создан \n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("E://Games/res/drawables");
        if (drawables.mkdir()) {
            StringBuilder.append("Каталог drawables создан \n");
        }else {
            StringBuilder.append("Каталог drawables не создан \n");
        }

        File vectors = new File("E://Games/res/vectors");
        if (vectors.mkdir()) {
            StringBuilder.append("Каталог vectors создан \n");
        } else {
            StringBuilder.append("Каталог vectors создан \n");
        }
        File icons = new File("E://Games/res/icons");
        if (icons.mkdir()) {
            StringBuilder.append("Каталог icons создан \n");
        } else{
            StringBuilder.append("Каталог icons не создан \n"); 
        }

        File tempTxt = new File("E://Games/temp/temp.txt");
        FileWriter writer = new FileWriter(tempTxt);
        writer.write(StringBuilder.toString());
        writer.flush();
        writer.close();
    }
}