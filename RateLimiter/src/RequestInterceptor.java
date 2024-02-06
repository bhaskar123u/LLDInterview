public class RequestInterceptor {
  
  BucketToken bucketToken;

  RequestInterceptor(BucketToken bucketToken) {
    this.bucketToken = bucketToken;
  }

  boolean getAccess() {
    return bucketToken.getToken() != -1;
  }
}
