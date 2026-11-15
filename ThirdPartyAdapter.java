public class ThirdPartyAdapter implements IPost{
    private ThirdPartyAPI api;
    public ThirdPartyAdapter(ThirdPartyAPI api){this.api=api;}
    public String getContent() {
        return "[Ad] "+api.fetchExternalContent();
    }
}