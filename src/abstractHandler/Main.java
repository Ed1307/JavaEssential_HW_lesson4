package abstractHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - XML, 2 - TXT, 3 - DOC");
        Scanner sc = new Scanner(System.in);
        int format = sc.nextInt();
        System.out.println("1 - open, 2 - create, 3 - change, 4 - save");
        int action = sc.nextInt();
        switch (format){
            case 1:{
                XMLHandler xml = new XMLHandler();
                switch(action){
                    case 1: xml.open();
                    break;
                    case 2: xml.create();
                    break;
                    case 3: xml.change();
                    break;
                    case 4: xml.save();
                    break;
                } break;
            }
            case 2:{
                TXTHandler txt = new TXTHandler();
                switch(action){
                    case 1: txt.open();
                        break;
                    case 2: txt.create();
                        break;
                    case 3: txt.change();
                        break;
                    case 4: txt.save();
                        break;
                } break;
            }
            case 3:{
                DOCHandler doc = new DOCHandler();
                switch(action){
                    case 1: doc.open();
                        break;
                    case 2: doc.create();
                        break;
                    case 3: doc.change();
                        break;
                    case 4: doc.save();
                        break;
                } break;
            }

        }
    }
}
