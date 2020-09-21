package cn.hp.springboot2.pojo;

import java.util.List;

public class bookType {
    private Integer typeid;
    private String typename;
    private String note;

    private List<bookInfo> info;

    public bookType() {
        super();
    }

    public bookType(Integer typeid, String typename, String note, List<bookInfo> info) {
        this.typeid = typeid;
        this.typename = typename;
        this.note = note;
        this.info = info;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<bookInfo> getInfo() {
        return info;
    }

    public void setInfo(List<bookInfo> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "bookType{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                ", note='" + note + '\'' +
                ", info=" + info +
                '}';
    }
}
