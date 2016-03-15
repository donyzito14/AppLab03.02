/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import uni.sistemas.entity.SSolutions;

public class SSolutionsModel {

    public SSolutionsModel() {

    }

    public String librery(int n1) {
        String n = String.valueOf(n1);
        return "Seiscientos Cincuenta y 00/100 Nuevos Soles";
    }

    public String librery(double n1) {
        String n = String.valueOf(n1);
        return "Seiscientos Ciencuenta y 65/100 Nuevos Soles";
    }

    public String librery(int n1, String text) {
        String n = String.valueOf(n1);
        return "Seiscientos Cincuenta y 00/100 " + text;
    }

    public String librery(Double n1, String text) {
        if (text == "Dolares") {
            String n = String.valueOf(n1);
            return "Seiscientos Cincuenta y 65/100 " + text;
        } else {
            String n = String.valueOf(n1);
            return "Seiscientos Cincuenta y 00/100 " + text;
        }
    }
//    public static void main (String []args){
//        
//        SSolutionsModel s = new SSolutionsModel();
//        System.out.println(s.librery(650.65));
//    }

}
