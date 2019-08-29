/*
 * This software was developed by employees of the National Institute of Standards and Technology (NIST), an agency of the Federal Government
 * and is being made available as a public service. Pursuant to title 17 United States Code Section 105, works of NIST employees are not
 * subject to copyright protection in the United States.  This software may be subject to foreign copyright.  Permission in the United States
 * and in foreign countries, to the extent that NIST may hold copyright, to use, copy, modify, create derivative works, and distribute
 * this software and its documentation without fee is hereby granted on a non-exclusive basis, provided that this notice and disclaimer of
 * warranty appears in all copies.
 *
 * THE SOFTWARE IS PROVIDED 'AS IS' WITHOUT ANY WARRANTY OF ANY KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT LIMITED TO,
 * ANY WARRANTY THAT THE SOFTWARE WILL CONFORM TO SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 * AND FREEDOM FROM INFRINGEMENT, AND ANY WARRANTY THAT THE DOCUMENTATION WILL CONFORM TO THE SOFTWARE, OR ANY WARRANTY THAT THE SOFTWARE WILL
 * BE ERROR FREE.  IN NO EVENT SHALL NIST BE LIABLE FOR ANY DAMAGES, INCLUDING, BUT NOT LIMITED TO, DIRECT, INDIRECT, SPECIAL OR CONSEQUENTIAL
 * DAMAGES, ARISING OUT OF, RESULTING FROM, OR IN ANY WAY CONNECTED WITH THIS SOFTWARE, WHETHER OR NOT BASED UPON WARRANTY, CONTRACT, TORT, OR OTHERWISE,
 * WHETHER OR NOT INJURY WAS SUSTAINED BY PERSONS OR PROPERTY OR OTHERWISE, AND WHETHER OR NOT LOSS WAS SUSTAINED FROM, OR AROSE OUT OF THE RESULTS OF,
 * OR USE OF, THE SOFTWARE OR SERVICES PROVIDED HEREUNDER.
 */
package gov.nist.oism.asd.ltecoveragetool;

import java.io.Serializable;
import java.util.Date;

class DataReading implements Serializable {

    static final int UNAVAILABLE = 2147483647;
    static final int LOW_RSRP = -141;
    static final int LOW_RSRQ = -20;
    static final int LOW_RSSNR = -20;
    static final int PCI_NA = -1;
    static final int EXECELLENT_RSRP_THRESHOLD = -95;
    static final int GOOD_RSRP_THRESHOLD = -110;
    static final int POOR_RSRP_THRESHOLD = -140;

    private Date timestamp;
    private int rsrp;
    private int rsrq;
    private int rssnr;
    private int dBm;
    private int pci;
    private int connected;
    private String operator;

    DataReading() {
        this.timestamp = new Date();
        this.rsrp = UNAVAILABLE;
        this.rsrq = UNAVAILABLE;
        this.rssnr = UNAVAILABLE;
        this.dBm = UNAVAILABLE;
        this.pci = PCI_NA;
        this.operator = "";
    }

    DataReading(DataReading dataReading) {
        this.timestamp = new Date();
        this.rsrp = dataReading.rsrp;
        this.rsrq = dataReading.rsrq;
        this.rssnr = dataReading.rssnr;
        this.dBm = dataReading.dBm;
        this.pci = dataReading.pci;
        this.operator = dataReading.operator;
    }

    Date getTimestamp() {
        return new Date(timestamp.getTime());
    }

    int getRsrp() {
        return rsrp;
    }

    void setRsrp(int rsrp) {
        this.rsrp = rsrp;
    }

    int getRsrq() {
        return rsrq;
    }

    void setRsrq(int rsrq) {
        this.rsrq = rsrq;
    }

    int getRssnr() {
        return rssnr;
    }

    void setRssnr(int rssnr) {
        this.rssnr = rssnr;
    }

    int getdBm() {
        return rssnr;
    }

    void setdBm(int dBm) {
        this.dBm = dBm;
    }

    int getPci() {
        return pci;
    }

    void setPci(int pci) {
        this.pci = pci;
    }

    int getConnected() {
        return connected;
    }

    void setConnected(int connected) {
        this.connected = connected;
    }

    String getOperator() {
        return operator;
    }

    void setOperator(String operator) {
        this.operator = operator;
    }
}
