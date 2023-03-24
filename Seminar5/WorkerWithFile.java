package Seminar5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface WorkerWithFile {
    default String[] readFile(String nameFile) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(String.format("/src/Seminar5/Data/%s", nameFile));
        BufferedReader br = new BufferedReader(new FileReader(pathFile));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(";");
            line = br.readLine();
        }
        String everything = sb.toString();
        String[] sss = everything.split(";");
        br.close();
        return sss;
    }
}
