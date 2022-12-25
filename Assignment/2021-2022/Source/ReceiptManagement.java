import java.io.*;
import java.util.*;

public class ReceiptManagement {
    private AVL receiptTree;

    public ReceiptManagement(){
        this.receiptTree = new AVL();
    }

    public boolean readReceiptList(String filePath){
        ArrayList<Receipt> receiptList = new ArrayList<Receipt>();
        try{
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String content = sc.nextLine();
                String[] attributes = content.split(",");
                ArrayList<String> tmpProductList = new ArrayList<String>();
                attributes[1] = attributes[1].replaceAll("[\\[\\]]", "");
                String[] products = attributes[1].split("_");
                for(String tmp : products){
                    tmpProductList.add(tmp);
                }
                Receipt tmpReceipt = new Receipt(Integer.parseInt(attributes[0]), tmpProductList, attributes[2]);
                receiptList.add(tmpReceipt);
            }
            sc.close();
            buildTreeFromReceiptList(receiptList);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return false;
        } 
        return true;
    }

    public void buildTreeFromReceiptList(ArrayList<Receipt> receiptList){
        for(Receipt r : receiptList){
            receiptTree.insertReceipt(r);
        }
    }

    public void traversalTree(String filePath){
        ArrayList<String> result = new ArrayList<String>();
        receiptTree.NLR(result);
        if(result.isEmpty()){
            result.add("No item here");
        }
        writeFile(filePath, result);
    }

    public void searchReceipt(String filePath, int receiptId){
        String receipt = receiptTree.search(receiptId);
        writeFile(filePath, receipt);
    }

    public boolean writeFile(String filePath, ArrayList<String> result){
        try{
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f);
            for(String r : result){
                fw.write(r + "\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.println("Can't write file");
            return false;
        }
        return true;
    }

    public boolean writeFile(String filePath, String receipt){
        try{
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f);
            if(receipt == null){
                fw.write("No receipt here");
                fw.close();
                return true;
            }
            fw.write(receipt);
            fw.close();
        }catch(IOException e){
            System.out.println("Can't write file");
            return false;
        }
        return true;
    }
}
