/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ulang_quiz1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Zainul Rifqi
 * Nama : ZaeZain
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    private String name,email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        String timeStamp = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }
    
    
}
