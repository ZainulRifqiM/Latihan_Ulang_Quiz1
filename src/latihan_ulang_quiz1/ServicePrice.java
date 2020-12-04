/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ulang_quiz1;

/**
 *
 * @author Zainul Rifqi
 * Nama : ZaeZain
 */
public class ServicePrice implements ServiceItem{
    private float priceService,discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
     @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch (serviceItem) {
            case 1:
                setPriceService(45000);
                break;
            case 2:
                setPriceService(55000);
                break;
            case 3:
                setPriceService(15000);
                break;
            default:
                break;
        }
        return getPriceService();
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if ("yes".equals(statusMember) || "Yes".equals(statusMember)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if (isMember) {
            discount = (float) (0.1 * parServicePrice);
        } else {
            discount = 0;
        }
        return discount;
    }
    
    public float getTotalPay(float priceService, float discount){
        return priceService - discount;
    }
}
