package day43_interfaces_iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod{


    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    public static void main(String[] args) {


        I01_InterfaceBodyOlanMethod.direksiyon();

        M02_Child obj=new M02_Child();
        obj.teker();

    }
}
