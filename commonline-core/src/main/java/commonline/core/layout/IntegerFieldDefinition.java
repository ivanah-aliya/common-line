package commonline.core.layout;


public class IntegerFieldDefinition extends flapjack.cobol.layout.IntegerFieldDefinition implements CommonlineFieldDefinition {
    private String id;

    public IntegerFieldDefinition(String id, String name, int position, String pattern) {
        super(name, position, pattern);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
