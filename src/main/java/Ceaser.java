class Cipher{

    private String mEncrypt;
    private String mDecrypt;
    private int mKey;
    public Cipher(String encrypt, String decrypt, int key){
        mEncrypt = encrypt;
        mDecrypt = decrypt;
        mKey = key;
    }
}