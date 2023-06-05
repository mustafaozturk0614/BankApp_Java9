package com.bilgeadam;

import com.bilgeadam.controller.AccountController;
import com.bilgeadam.controller.BankController;
import com.bilgeadam.controller.CustomerController;
import com.bilgeadam.repository.AccountRepository;
import com.bilgeadam.repository.BankRepository;
import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.repository.enums.EAccountType;
import com.bilgeadam.utility.BankAppUtility;

import java.util.Arrays;
import java.util.List;

public class Main {
   static BankController bankController=new BankController();
    static CustomerController customerController=new CustomerController();
    static AccountController accountController=new AccountController();

    public static void main(String[] args) {
// initliazeBank();
// menu();
  //  accountController.findByCreatedDateWithNamedQuery().forEach(System.out::println);
     //   System.out.println(accountController.sumAccountOneBank(2L));
//        BankRepository bankRepository=new BankRepository();
//        bankRepository.deneme();
        AccountRepository accountRepository=new AccountRepository();
        accountRepository.joinOrnek();


    }


    public static  void  initliazeBank(){
        Bank bank= Bank.builder()
                .name("Garanti")
                .build();
        Bank bank2= Bank.builder()
                .name("Ziraat")
                .build();
        bankController.createBank(bank);
        bankController.createBank(bank2);
    }

    public  static  void menu(){

        int choose=0;
        do {
            System.out.println("1-Musteri Olustur");
            System.out.println("2-Giriş Yap");
            System.out.println("0-Çıkış Yap");
            choose= BankAppUtility.intVeriAlma("Lütfen bir seçim yapınız");
           switch (choose){
               case  1:
                    musteriOlustur();
                   break;
               case  2:
                   break;
               case  0:
                   break;
               default:
                   System.out.println("Hatalı bir seçim yaptınız");
                   break;
           }

        }while (choose!=0);

    }

    private static void musteriOlustur() {
     List<Bank> bankList= bankController.findAll();
        bankList.forEach(x-> System.out.println(x.getId()+"-"+x.getName()));
        Long bankId=BankAppUtility.longVeriAlma("Lütfen bir banka id si giriniz");
        Bank bank=bankList.stream().filter(x->x.getId()==bankId).findFirst().get();
        Account account=  createAccount(bank);
        customerController.createCustomer(bank,account);
    }
    private static Account createAccount(Bank bank) {
        EAccountType [] accountTypes=EAccountType.values();
      //  Arrays.asList(accountTypes).stream().forEach(x->x);
        for (EAccountType type :accountTypes){
            System.out.println((type.ordinal()+1)+"-"+type.name());
        }
        int index=BankAppUtility.intVeriAlma("Lütfen bir hesap turu seciniz")-1;
        EAccountType accountType=accountTypes[index];
        Account account= Account.builder()
                .accountType(accountType)
                .bank(bank)
                .build();
        return account;
    }


}