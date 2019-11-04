package com.mbednarz.ident2;

import com.mbednarz.ident.BaseSeleniumClass;

public class ClassInDiffPckg extends BaseSeleniumClass {

    public void checkAccessFromSubclass()
    {
        System.out.println(first);
        //System.out.println(second); // pole BEZ IDENTYFIKATORA (DOMYSLNY) jest dostęne tylko wewnątrz pakietu gdzie znajduje się klasa
        System.out.println(third);
        //System.out.println(fourth); // pole typu PRIVATE dostępne jest tylko w obrębie klasy (i pakietu, gdzie ta klasa się znajduje) w której zostało zdefiniowane
    }
}
