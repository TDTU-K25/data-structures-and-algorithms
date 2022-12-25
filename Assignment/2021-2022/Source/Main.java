public class Main {
    public static void main(String args[]){   
        if(args.length <= 1){
            System.out.println("Please insert the arguments");
            return;
        }
        switch(args[0]){
            case "1":
                ReceiptManagement rm = new ReceiptManagement();
                rm.readReceiptList("data/receipt.txt");
                switch(args[1]){
                    case "1":
                        rm.traversalTree("Req1.txt");
                        break;
                    case "2":
                        rm.searchReceipt("Req2.txt", 3);
                        break;
                    default:
                        System.out.println("Incorrect argument");
                }
                break;
            case "2":
                RatingQuery rq = new RatingQuery("data/customer.txt", "data/product.txt", "data/rating.txt");
                switch(args[1]){
                    case "1":
                        rq.writeFile("Req3.txt", rq.query1("Q601"));
                        break;
                    case "2":
                        rq.writeFile("Req4.txt", rq.query2(1));
                        break;
                    case "3":
                        rq.writeFile("Req5.txt", rq.query3());
                        break;
                    default:
                        System.out.println("Incorrect argument");
                }
                break;
            default:
                System.out.println("Incorrect argument");
        }
    }
}
