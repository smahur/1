package DomashnieZadanie3;

public class Dz4 {

int Monday =1,Tuesday=2,Wednesday=3,Thursday=4,Friday=5,Saturday=6,Sunday=7;

        String[] month = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
        int n;
        public void foo () {
            for(int i = 0; i<month.length;i++){
                switch (n){
                    case 1:
                        System.out.println(Monday);
                        n++;
                    case 2:
                        System.out.println(Tuesday);
                    case 3:
                        System.out.println(Wednesday);
                    case 4:
                        System.out.println(Thursday);
                    case 5:
                        System.out.println(Friday);
                    case 6:
                        System.out.println(Saturday);
                    case 7:
                        System.out.println(Sunday);
                    case 8:
                        System.out.println(Monday);
                    case 9:
                        System.out.println(Tuesday);
                    case 10:
                        System.out.println(Wednesday);
                    default:
                        System.out.println("Not found");

                }
                System.out.println(month[i]);
            }

        }
    }
