/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author INAMETCLIN-3
 */
public class form_monthly {
  private String StationId;
  private int elementId;
  private int yyyy;  
  
private String mm_01;
private String mm_02;
private String mm_03;
private String mm_04;
private String mm_05;
private String mm_06;
private String mm_07;
private String mm_08;
private String mm_09;
private String mm_10;
private String mm_11;
private String mm_12;
  
private String  flag01;
private String  flag02;
private String  flag03;
private String  flag04;
private String  flag05;
private String  flag06;
private String  flag07;
private String  flag08;
private String  flag09;
private String  flag10;
private String  flag11;
private String  flag12;

private String  period01;
private String  period02;
private String  period03;
private String  period04;
private String  period05;
private String  period06;
private String  period07;
private String  period08;
private String  period09;
private String  period10;
private String  period11;
private String  period12;

  private String signature;
  private int entryDatetime;
  //construtor

    public form_monthly(String StationId, int elementId, int yyyy, String mm_01, String mm_02, String mm_03, String mm_04, String mm_05, String mm_06, String mm_07, String mm_08, String mm_09, String mm_10, String mm_11, String mm_12, String flag01, String flag02, String flag03, String flag04, String flag05, String flag06, String flag07, String flag08, String flag09, String flag10, String flag11, String flag12, String period01, String period02, String period03, String period04, String period05, String period06, String period07, String period08, String period09, String period10, String period11, String period12, String signature, int entryDatetime) {
        this.StationId = StationId;
        this.elementId = elementId;
        this.yyyy = yyyy;
        this.mm_01 = mm_01;
        this.mm_02 = mm_02;
        this.mm_03 = mm_03;
        this.mm_04 = mm_04;
        this.mm_05 = mm_05;
        this.mm_06 = mm_06;
        this.mm_07 = mm_07;
        this.mm_08 = mm_08;
        this.mm_09 = mm_09;
        this.mm_10 = mm_10;
        this.mm_11 = mm_11;
        this.mm_12 = mm_12;
        this.flag01 = flag01;
        this.flag02 = flag02;
        this.flag03 = flag03;
        this.flag04 = flag04;
        this.flag05 = flag05;
        this.flag06 = flag06;
        this.flag07 = flag07;
        this.flag08 = flag08;
        this.flag09 = flag09;
        this.flag10 = flag10;
        this.flag11 = flag11;
        this.flag12 = flag12;
        this.period01 = period01;
        this.period02 = period02;
        this.period03 = period03;
        this.period04 = period04;
        this.period05 = period05;
        this.period06 = period06;
        this.period07 = period07;
        this.period08 = period08;
        this.period09 = period09;
        this.period10 = period10;
        this.period11 = period11;
        this.period12 = period12;
        this.signature = signature;
        this.entryDatetime = entryDatetime;
    }
  
//codigo get e set
    public String getStationId() {
        return StationId;
    }

    public void setStationId(String StationId) {
        this.StationId = StationId;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    public String getMm_01() {
        return mm_01;
    }

    public void setMm_01(String mm_01) {
        this.mm_01 = mm_01;
    }

    public String getMm_02() {
        return mm_02;
    }

    public void setMm_02(String mm_02) {
        this.mm_02 = mm_02;
    }

    public String getMm_03() {
        return mm_03;
    }

    public void setMm_03(String mm_03) {
        this.mm_03 = mm_03;
    }

    public String getMm_04() {
        return mm_04;
    }

    public void setMm_04(String mm_04) {
        this.mm_04 = mm_04;
    }

    public String getMm_05() {
        return mm_05;
    }

    public void setMm_05(String mm_05) {
        this.mm_05 = mm_05;
    }

    public String getMm_06() {
        return mm_06;
    }

    public void setMm_06(String mm_06) {
        this.mm_06 = mm_06;
    }

    public String getMm_07() {
        return mm_07;
    }

    public void setMm_07(String mm_07) {
        this.mm_07 = mm_07;
    }

    public String getMm_08() {
        return mm_08;
    }

    public void setMm_08(String mm_08) {
        this.mm_08 = mm_08;
    }

    public String getMm_09() {
        return mm_09;
    }

    public void setMm_09(String mm_09) {
        this.mm_09 = mm_09;
    }

    public String getMm_10() {
        return mm_10;
    }

    public void setMm_10(String mm_10) {
        this.mm_10 = mm_10;
    }

    public String getMm_11() {
        return mm_11;
    }

    public void setMm_11(String mm_11) {
        this.mm_11 = mm_11;
    }

    public String getMm_12() {
        return mm_12;
    }

    public void setMm_12(String mm_12) {
        this.mm_12 = mm_12;
    }

    public String getFlag01() {
        return flag01;
    }

    public void setFlag01(String flag01) {
        this.flag01 = flag01;
    }

    public String getFlag02() {
        return flag02;
    }

    public void setFlag02(String flag02) {
        this.flag02 = flag02;
    }

    public String getFlag03() {
        return flag03;
    }

    public void setFlag03(String flag03) {
        this.flag03 = flag03;
    }

    public String getFlag04() {
        return flag04;
    }

    public void setFlag04(String flag04) {
        this.flag04 = flag04;
    }

    public String getFlag05() {
        return flag05;
    }

    public void setFlag05(String flag05) {
        this.flag05 = flag05;
    }

    public String getFlag06() {
        return flag06;
    }

    public void setFlag06(String flag06) {
        this.flag06 = flag06;
    }

    public String getFlag07() {
        return flag07;
    }

    public void setFlag07(String flag07) {
        this.flag07 = flag07;
    }

    public String getFlag08() {
        return flag08;
    }

    public void setFlag08(String flag08) {
        this.flag08 = flag08;
    }

    public String getFlag09() {
        return flag09;
    }

    public void setFlag09(String flag09) {
        this.flag09 = flag09;
    }

    public String getFlag10() {
        return flag10;
    }

    public void setFlag10(String flag10) {
        this.flag10 = flag10;
    }

    public String getFlag11() {
        return flag11;
    }

    public void setFlag11(String flag11) {
        this.flag11 = flag11;
    }

    public String getFlag12() {
        return flag12;
    }

    public void setFlag12(String flag12) {
        this.flag12 = flag12;
    }

    public String getPeriod01() {
        return period01;
    }

    public void setPeriod01(String period01) {
        this.period01 = period01;
    }

    public String getPeriod02() {
        return period02;
    }

    public void setPeriod02(String period02) {
        this.period02 = period02;
    }

    public String getPeriod03() {
        return period03;
    }

    public void setPeriod03(String period03) {
        this.period03 = period03;
    }

    public String getPeriod04() {
        return period04;
    }

    public void setPeriod04(String period04) {
        this.period04 = period04;
    }

    public String getPeriod05() {
        return period05;
    }

    public void setPeriod05(String period05) {
        this.period05 = period05;
    }

    public String getPeriod06() {
        return period06;
    }

    public void setPeriod06(String period06) {
        this.period06 = period06;
    }

    public String getPeriod07() {
        return period07;
    }

    public void setPeriod07(String period07) {
        this.period07 = period07;
    }

    public String getPeriod08() {
        return period08;
    }

    public void setPeriod08(String period08) {
        this.period08 = period08;
    }

    public String getPeriod09() {
        return period09;
    }

    public void setPeriod09(String period09) {
        this.period09 = period09;
    }

    public String getPeriod10() {
        return period10;
    }

    public void setPeriod10(String period10) {
        this.period10 = period10;
    }

    public String getPeriod11() {
        return period11;
    }

    public void setPeriod11(String period11) {
        this.period11 = period11;
    }

    public String getPeriod12() {
        return period12;
    }

    public void setPeriod12(String period12) {
        this.period12 = period12;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(int entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

}
