package no.jlwcrews.jdbcdemo.model;

import org.springframework.data.annotation.Id;

public class Part {
    @Id
    private Integer partId;
    private String partName;
    private int partQuantity;

    public Part(String partName, int partQuantity) {
        this.partName = partName;
        this.partQuantity = partQuantity;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getPartQuantity() {
        return partQuantity;
    }

    public void setPartQuantity(int partQuantity) {
        this.partQuantity = partQuantity;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partId=" + partId +
                ", partName='" + partName + '\'' +
                ", partQuantity=" + partQuantity +
                '}';
    }
}
