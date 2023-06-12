package com.cis.week2.day4;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CsvAssign {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        StudentData[] studentData = new StudentData[10];

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\priya\\javabatch-32\\JavaCisTech\\src\\com\\cis\\week2\\day4\\assignment1.csv"))) {
            int i = 0;
            br.readLine();

            while ((line = br.readLine()) != null && i < studentData.length) {
                String[] student = line.split(splitBy);
                studentData[i] = new StudentData(student[0],student[1], Double.parseDouble(student[2]));
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Arrays.sort(studentData, 0, studentData.length);

        for (StudentData student : studentData) {
            if (student != null) {
                student.display();
            }
        }
    }
}


