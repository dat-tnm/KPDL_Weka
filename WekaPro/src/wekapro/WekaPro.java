/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

/**
 *
 * @author Admin
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        MyKnowledgeModel model = new MyKnowledgeModel(
                "C:\\Program Files\\Weka-3-9-5\\data\\iris.arff");
        
        System.out.println(model);
        model.saveData("E:\\iris.arff");
        model.saveData2CSV("E:\\iris.csv");
    }
    
}
