/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import wekapro.emsembles.MyBaggingModel;
import weka.classifiers.trees.J48;
import wekapro.cluster.MyEMModel;
import wekapro.cluster.MyKMeansModel;
import wekapro.emsembles.MyBlendingModel;
import wekapro.emsembles.MyBoostingModel;
import wekapro.emsembles.MyVotingModel;

/**
 *
 * @author Admin
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel(
//                "C:\\Program Files\\Weka-3-9-5\\data\\iris.arff");
//        
//        System.out.println(model);
//        model.saveData("E:\\iris.arff");
//        model.saveData2CSV("E:\\iris.csv");
        
//        MyAprioriModel model = new MyAprioriModel(
//                "C:\\Program Files\\Weka-3-9-5\\data\\weather.numeric.arff",
//                "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.15 -S -1.0 -c -1",
//                "-R 2-3");
//        model.mineAssociatetionRules();
//        System.out.print(model);

//        MyFPGrowthModel model = new MyFPGrowthModel(
//                "C:\\Program Files\\Weka-3-9-5\\data\\weather.nominal.arff",
//                "-P 2 -I -1 -N 10 -T 0 -C 0.8 -D 0.05 -U 1.0 -M 0.2",
//                "-N -R first-last"
//        );
//        
//        model.mineAssociationRule();
//        System.out.print(model);

//        MyKnowledgeModel model = new MyKnowledgeModel(
//                "C:\\Program Files\\Weka-3-9-5\\data\\iris.arff", null, null);
//        model.trainset = model.divideTrainTestResample(model.dataset, 80, false);
//        model.testset = model.divideTrainTestResample(model.dataset, 80, true);
//        System.out.print(model);
//        System.out.print(model.trainset.toSummaryString());
//        System.out.print(model.testset.toSummaryString());

//        MyDecisionTreeModel model = new MyDecisionTreeModel(
//                "C:\\Program Files\\Weka-3-9-5\\data\\iris.arff",
//                "-C 0.25 -M 2", null);
//        model.buildDecisionTree();
//        model.evaluateDecisionTree();
//        System.out.println(model);
//        //model.saveModel("E:\\decisionTree.model", model.tree);
//        model.tree = (J48)model.loadModel("E:\\decisionTree.model");
//        model.predictClassLabel(model.testset);
        
//        MyNaiveBayesModel model = new MyNaiveBayesModel();
//        model.buildNaiveBayes("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateNaiveBayes("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict.arff");
//        System.out.println(model);
        
//        MyNeuralNetworkModel model = new MyNeuralNetworkModel("",
//            "-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a -R", null);
//        model.buildNeuralNetwork("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateNeuralNetwork("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict.arff");
//        System.out.println(model);

//        MySVMModel model = new MySVMModel("",
//            "-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007\" -calibrator \"weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4\"", null);
//        model.buildSVM("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateSVM("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict.arff");
//        System.out.println(model);
        
//        MyKNNModel model = new MyKNNModel("",
//            "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"", null);
//        model.buildKNN("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateKNN("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict.arff");
//        System.out.println(model);
        
//        MyBaggingModel model = new MyBaggingModel("",
//            "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"", null);
//        model.buildBaggingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateBaggingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict_bag.arff");
//        System.out.println(model);
        
//        MyBoostingModel model = new MyBoostingModel("",
//            "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"", null);
//        model.buildBoostingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateBoostingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict_boost.arff");
//        System.out.println(model);
        
//        MyVotingModel model = new MyVotingModel("",
//            "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"", null);
//        model.buildVotingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateVotingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict_vote.arff");
//        System.out.println(model);
        
//        MyBlendingModel model = new MyBlendingModel("",
//            null, null);
//        model.buildBlendingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_train.arff");
//        model.evaluateBlendingModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\Desktop\\weka_files\\iris_predict_blending.arff");
//        System.out.println(model);

        MyKMeansModel model = new MyKMeansModel("", null, null);
        model.buildKMeansModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_cluster_train.arff");
        model.predictCluster("C:\\Users\\Admin\\Desktop\\weka_files\\iris_cluster_unlabel.arff");
        System.out.println("Finished");
//        
//        MyEMModel model = new MyEMModel("", null, null);
//        model.buildEMModel("C:\\Users\\Admin\\Desktop\\weka_files\\iris_cluster_train.arff");
//        model.predictCluster("C:\\Users\\Admin\\Desktop\\weka_files\\iris_cluster_unlabel.arff");
//        System.out.println("Finished");
    }
    
}
