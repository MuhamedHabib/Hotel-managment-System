package Entity;

public class reservation {
    private Integer idResrv;
    private Integer products_id;
    private String nom_c;
    private String prenom_c;
    private String email;
    private String ville;
    private String code_postale, adresse, telephone;

    public reservation(Integer idResrv, Integer products_id, String nom_c, String prenom_c, String email, String ville, String code_postale, String adresse, String telephone) {
        this.idResrv = idResrv;
        this.products_id = products_id;
        this.nom_c = nom_c;
        this.prenom_c = prenom_c;
        this.email = email;
        this.ville = ville;
        this.code_postale = code_postale;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public reservation(Integer idResrv, String nom_c, String prenom_c, String email, String ville, String code_postale, String adresse, String telephone) {
        this.idResrv = idResrv;
        this.nom_c = nom_c;
        this.prenom_c = prenom_c;
        this.email = email;
        this.ville = ville;
        this.code_postale = code_postale;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "offre{" +
                "idoffre=" + idResrv +
                ", titleoffre='" + nom_c + '\'' +
                ", priceoffre='" + prenom_c + '\'' +
                ", nombreplace='" + email + '\'' +
                ", description='" + ville + '\'' +
                ", localisation='" + code_postale + '\'' +
                ", style='" + adresse + '\'' +
                ", image='" + telephone + '\'' +
                '}';
    }

    public Integer getProducts_id() {
        return products_id;
    }

    public void setProducts_id(Integer products_id) {
        this.products_id = products_id;
    }

    public Integer getIdResrv() {
        return idResrv;
    }

    public void setIdResrv(Integer idResrv) {
        this.idResrv = idResrv;
    }

    public String getNom_c() {
        return nom_c;
    }

    public void setNom_c(String nom_c) {
        this.nom_c = nom_c;
    }

    public String getPrenom_c() {
        return prenom_c;
    }

    public void setPrenom_c(String prenom_c) {
        this.prenom_c = prenom_c;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCode_postale() {
        return code_postale;
    }

    public void setCode_postale(String code_postale) {
        this.code_postale = code_postale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}


