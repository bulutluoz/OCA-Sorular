package yeniSorular.sXX_Interface;

interface Carnivora{
    void eatFlesh();
}

interface Leopardus{
    void spottedFur();
    void roundedEar();
}

 abstract class Felis implements Leopardus{
    abstract void wideSkull();
    void eatFlesh(){
    }
}

public class DomesticCats extends Felis {
    @Override
    public void spottedFur() {

    }
    @Override
    public void roundedEar() {

    }
    @Override
    void wideSkull() {

    }
}

/*
    Yukardaki kod blogu icin hangileri dogrudur?
    A- spottedFur() Felis tarafindan override edilmek zorundadir
    B- roundedEar() DomesticCats tarafindan override edilmek zorundadir
    C- eatFlesH() Felis tarafindan override edilirse DomesticCats tarafindan override edilmeyebilir
    D- roundedEar() Felis tarafindan override edilse bile DomesticCats tarafindan mutlaka override edilmelidir
 */
