package com.wd.cs.po;

import java.util.Date;

public class Doc {
    private String id;

    private String jguid;

    private String docTitle;

    private String docTitleTranslated;

    private Date year;

    private String ptype;

    private String language;

    private String utWos;

    private String bookDoi;

    private String doi;

    private String url;

    private String volume;

    private String issue;

    private String pageRange;

    private Integer pageNum;

    private Integer citesInwos;

    private Integer cites;

    private String abstractInfo;

    private String biyinId;

    private String spiderId;

    private String fund;

    private String fundText;

    private Integer referencesNum;

    private String publisher;

    private Date publishDate;

    private String publisherCity;

    private String publisherAddress;

    private String issnueSpe;

    private String seriesTitle;

    private String seriesSubTitle;

    private String conferenceTitle;

    private String conferenceAb;

    private String conferenceAddr;

    private Date conferenceDate;

    private String conferenceSupport;

    private String conferenceSponsor;

    private String email;

    private String rai;

    private String oai;

    private String isoAbb;

    private String pNomal;

    private String suJournal;

    private String docNum;

    private String chapterNum;

    private String deliveryNum;

    private String pmid;

    private String halfCites;

    private Integer useNum;

    private String fileName;

    private Integer validata;

    private Date lastUpdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJguid() {
        return jguid;
    }

    public void setJguid(String jguid) {
        this.jguid = jguid == null ? null : jguid.trim();
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle == null ? null : docTitle.trim();
    }

    public String getDocTitleTranslated() {
        return docTitleTranslated;
    }

    public void setDocTitleTranslated(String docTitleTranslated) {
        this.docTitleTranslated = docTitleTranslated == null ? null : docTitleTranslated.trim();
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getUtWos() {
        return utWos;
    }

    public void setUtWos(String utWos) {
        this.utWos = utWos == null ? null : utWos.trim();
    }

    public String getBookDoi() {
        return bookDoi;
    }

    public void setBookDoi(String bookDoi) {
        this.bookDoi = bookDoi == null ? null : bookDoi.trim();
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi == null ? null : doi.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getPageRange() {
        return pageRange;
    }

    public void setPageRange(String pageRange) {
        this.pageRange = pageRange == null ? null : pageRange.trim();
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getCitesInwos() {
        return citesInwos;
    }

    public void setCitesInwos(Integer citesInwos) {
        this.citesInwos = citesInwos;
    }

    public Integer getCites() {
        return cites;
    }

    public void setCites(Integer cites) {
        this.cites = cites;
    }

    public String getAbstractInfo() {
        return abstractInfo;
    }

    public void setAbstractInfo(String abstractInfo) {
        this.abstractInfo = abstractInfo == null ? null : abstractInfo.trim();
    }

    public String getBiyinId() {
        return biyinId;
    }

    public void setBiyinId(String biyinId) {
        this.biyinId = biyinId == null ? null : biyinId.trim();
    }

    public String getSpiderId() {
        return spiderId;
    }

    public void setSpiderId(String spiderId) {
        this.spiderId = spiderId == null ? null : spiderId.trim();
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund == null ? null : fund.trim();
    }

    public String getFundText() {
        return fundText;
    }

    public void setFundText(String fundText) {
        this.fundText = fundText == null ? null : fundText.trim();
    }

    public Integer getReferencesNum() {
        return referencesNum;
    }

    public void setReferencesNum(Integer referencesNum) {
        this.referencesNum = referencesNum;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisherCity() {
        return publisherCity;
    }

    public void setPublisherCity(String publisherCity) {
        this.publisherCity = publisherCity == null ? null : publisherCity.trim();
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress == null ? null : publisherAddress.trim();
    }

    public String getIssnueSpe() {
        return issnueSpe;
    }

    public void setIssnueSpe(String issnueSpe) {
        this.issnueSpe = issnueSpe == null ? null : issnueSpe.trim();
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle == null ? null : seriesTitle.trim();
    }

    public String getSeriesSubTitle() {
        return seriesSubTitle;
    }

    public void setSeriesSubTitle(String seriesSubTitle) {
        this.seriesSubTitle = seriesSubTitle == null ? null : seriesSubTitle.trim();
    }

    public String getConferenceTitle() {
        return conferenceTitle;
    }

    public void setConferenceTitle(String conferenceTitle) {
        this.conferenceTitle = conferenceTitle == null ? null : conferenceTitle.trim();
    }

    public String getConferenceAb() {
        return conferenceAb;
    }

    public void setConferenceAb(String conferenceAb) {
        this.conferenceAb = conferenceAb == null ? null : conferenceAb.trim();
    }

    public String getConferenceAddr() {
        return conferenceAddr;
    }

    public void setConferenceAddr(String conferenceAddr) {
        this.conferenceAddr = conferenceAddr == null ? null : conferenceAddr.trim();
    }

    public Date getConferenceDate() {
        return conferenceDate;
    }

    public void setConferenceDate(Date conferenceDate) {
        this.conferenceDate = conferenceDate;
    }

    public String getConferenceSupport() {
        return conferenceSupport;
    }

    public void setConferenceSupport(String conferenceSupport) {
        this.conferenceSupport = conferenceSupport == null ? null : conferenceSupport.trim();
    }

    public String getConferenceSponsor() {
        return conferenceSponsor;
    }

    public void setConferenceSponsor(String conferenceSponsor) {
        this.conferenceSponsor = conferenceSponsor == null ? null : conferenceSponsor.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRai() {
        return rai;
    }

    public void setRai(String rai) {
        this.rai = rai == null ? null : rai.trim();
    }

    public String getOai() {
        return oai;
    }

    public void setOai(String oai) {
        this.oai = oai == null ? null : oai.trim();
    }

    public String getIsoAbb() {
        return isoAbb;
    }

    public void setIsoAbb(String isoAbb) {
        this.isoAbb = isoAbb == null ? null : isoAbb.trim();
    }

    public String getpNomal() {
        return pNomal;
    }

    public void setpNomal(String pNomal) {
        this.pNomal = pNomal == null ? null : pNomal.trim();
    }

    public String getSuJournal() {
        return suJournal;
    }

    public void setSuJournal(String suJournal) {
        this.suJournal = suJournal == null ? null : suJournal.trim();
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum == null ? null : docNum.trim();
    }

    public String getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(String chapterNum) {
        this.chapterNum = chapterNum == null ? null : chapterNum.trim();
    }

    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum == null ? null : deliveryNum.trim();
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid == null ? null : pmid.trim();
    }

    public String getHalfCites() {
        return halfCites;
    }

    public void setHalfCites(String halfCites) {
        this.halfCites = halfCites == null ? null : halfCites.trim();
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getValidata() {
        return validata;
    }

    public void setValidata(Integer validata) {
        this.validata = validata;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}