package PPJ.PPj23_Task1_2_3_4_5;

public class Main {
    public static void main(String[] args) {


        Phone phone = new Phone();
        phone.call("123-553-221");

        phone.showHistoryOfCalls();


       MobileDevice mobileDevice = new MobileDevice();
       mobileDevice.call("111-111-111");
       mobileDevice.call("222-111-111");
        System.out.println("History of calls with mobile device:");
       mobileDevice.showHistoryOfCalls();

       SmartPhone smartPhone = new SmartPhone();
       smartPhone.addFriend("Jan","Kowalski","111-111-111");
       smartPhone.addFriend("Kuba","Kowalski","222-222-222");
       smartPhone.call("111-111-111");
        smartPhone.call("222-222-222");
        smartPhone.call("133-222-111");
        System.out.println("History of calls with smart phone:");
       smartPhone.showHistoryOfCalls();

        Phone[] arrayOfPhones = new Phone[3];
        arrayOfPhones[0] = new Phone();
        arrayOfPhones[1] = new MobileDevice();
        arrayOfPhones[2] = new SmartPhone();

        System.out.println("\ntask 5 \n");

        for (int i = 0; i < 10; i++) {
            for (Phone phone1 : arrayOfPhones) {
                if (i % 2 == 0) {
                    phone1.call("111-111-111");
                } else {
                    phone1.call("987-654-321");
                }
            }
        }

        for(Phone cls:arrayOfPhones){
            System.out.println(cls);
        }


    }
}
