class Solution {
    public String defangIPaddr(String ad) {
        return ad.replaceAll("[.]","[.]");
    }
}
