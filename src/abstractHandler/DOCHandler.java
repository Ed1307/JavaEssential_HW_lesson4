package abstractHandler;

class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("DOC open");
    }

    @Override
    void create() {
        System.out.println("DOC create");
    }

    @Override
    void change() {
        System.out.println("DOC change");
    }

    @Override
    void save() {
        System.out.println("DOC save");
    }
}


