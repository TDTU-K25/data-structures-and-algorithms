import java.io.*;
import java.util.*;

public class RatingQuery {
    private ArrayList<Rating> edges;
    private ArrayList<Product> productList;
    private ArrayList<Customer> customerList;

    public RatingQuery(String customerPath, String productPath, String ratingPath){
        edges = new ArrayList<Rating>();
        productList = new ArrayList<Product>();
        customerList = new ArrayList<Customer>();
        readCustomerFile(customerPath);
        readProductFile(productPath);
        buildGraph(ratingPath);
    }

    public void printGraph(){
		for(int i = 0; i < edges.size(); i++){
			System.out.println(edges.get(i));
		}
	}

    public boolean readCustomerFile(String filePath){
        try{
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String content = sc.nextLine();
                String[] attributes = content.split(",");
                Customer tmpCustomer = new Customer(attributes[0], attributes[1], attributes[2]);
                customerList.add(tmpCustomer);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return false;
        } 
        return true;
    }

    public boolean readProductFile(String filePath){
        try{
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String content = sc.nextLine();
                String[] attributes = content.split(",");
                Product tmpProduct = new Product(Integer.parseInt(attributes[0]), attributes[1], attributes[2]);
                productList.add(tmpProduct);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return false;
        } 
        return true;
    }

    public void addEdge(Customer u, Product v, int w){
		////code here
	}

    public boolean buildGraph(String filePath){
        try{
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String content = sc.nextLine();
                String[] attributes = content.split(",");
                Customer tmpCustomer = new Customer();
                Product tmpProduct = new Product();
                for(Customer c : customerList){
                    if(c.getCustomerId().equals(attributes[0]))
                        tmpCustomer = c;
                }
                for(Product p : productList){
                    if(p.getProductId() == Integer.parseInt(attributes[1]))
                        tmpProduct = p;
                }
                addEdge(tmpCustomer, tmpProduct, Integer.parseInt(attributes[2]));
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return false;
        } 
        return true;
    }

    public ArrayList<Product> query1(String customerId){
        //code here and change the return value
        return null;
    }

    public Integer query2(int productId){
        //code here and change the return value
        return null;
    }

    public ArrayList<Product> query3(){
        //code here and change the return value
        return null;
    }

    public <E> boolean writeFile(String filePath, ArrayList<E> list){
        try{
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f);
            if(list.size() == 0){
                fw.write("No item here");
                fw.close();
                return true;
            }
            for(E data : list){
                fw.write(data + "\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.println("Can't write file");
            return false;
        }

        return true;
    }

    public <E> boolean writeFile(String filePath, E data){
        try{
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f);
            fw.write(data.toString());
            fw.close();
        }catch(IOException e){
            System.out.println("Can't write file");
            return false;
        }
        return true;    
    }
}
