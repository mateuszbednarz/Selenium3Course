package com.mbednarz.ident2;

import com.mbednarz.ident.BaseSeleniumClass;

public class SecondClassInDiffPckg {

    public void accessCheck()
    {
        BaseSeleniumClass bsc = new BaseSeleniumClass();

        System.out.println(bsc.first);
        //System.out.println(bsc.second); // pole BEZ IDENTYFIKATORA (DOMYSLNY) jest dostęne tylko wewnątrz pakietu gdzie znajduje się klasa
        //System.out.println(bsc.third);  // pole typu PROTECTED jest dostępne tylko w obrębie pakietu w którym znajduje się klasa w której zostało zdefiniowane
        //System.out.println(bsc.fourth); // pole typu PRIVATE dostępne jest tylko w obrębie klasy (i pakietu, gdzie ta klasa się znajduje) w której zostało zdefiniowane
    }
}
