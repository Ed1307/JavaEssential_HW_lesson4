package abstractHandler;

class XMLHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("XML open");
    }

    @Override
    void create() {
        System.out.println("XML create");
    }

    @Override
    void change() {
        System.out.println("XML change");
    }

    @Override
    void save() {
        System.out.println("XML save");
    }
}
