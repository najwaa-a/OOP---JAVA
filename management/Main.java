/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

/**
 *
 * @author HP
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] nameList = {
            "Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway", "Rita Rangel",
            "Waldo Ontiveros", "Milton Grantham", "Loura Swilley", "Lola Duropan", "Kandis Mcnary",
            "Milford Kirts", "Denita Taniguchi", "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux",
            "Fernanda Overby", "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"
            };

        Employee[] employee = new Employee[nameList.length];

        Departement technical = new Departement("T001", "Tim Teknis", 100);
        Departement hr = new Departement("HR01", "Tim SDM", 5);
        Departement security = new Departement("S001", "Tim Keamanan", 5);

        for (int i = 0; i < nameList.length; i++) {
            employee[i] = new Employee("EMP" + String.format("%02d", i + 1), nameList[i]);
            employee[i].setDepartement(technical); // Semua masuk Tim Teknis awalnya
        }
        
        technical.printEmployeeList();
        hr.printEmployeeList();
        security.printEmployeeList();


        for (int i = 0; i < employee.length; i++) {
            int empNumber = i + 1;
                
            if (empNumber % 5 == 0) {
               employee[i].setDepartement(security);
            } else if (empNumber % 2 == 0) {
                employee[i].setDepartement(hr);
            }
        }        

            
        System.out.println("\nSetelah Transfer:");
        technical.printEmployeeList();
        hr.printEmployeeList();
        security.printEmployeeList();
    }

}
