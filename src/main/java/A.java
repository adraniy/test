import org.apache.log4j.Logger;

/**
 * test A class
 */
 class A {
    private static final Logger logger = Logger.getLogger(A.class);
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getSId() {
        logger.debug("getSId");
        if (this.id == 0) return 999;
        else return id;
    }

    @Override
    public String toString() {
        return "name1122211: " + name;
    }
}
