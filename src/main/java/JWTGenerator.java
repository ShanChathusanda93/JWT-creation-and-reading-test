import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.util.Date;

public class JWTGenerator {

    public static void main(String[] args) {
        JWTGenerator jwtGenerator=new JWTGenerator();
        jwtGenerator.createJWT();
    }
public void createJWT() {
    String s="";
    try {
        s = Jwts.builder()
                .setSubject("1234567890")
                .setId("9349d95e-e622-4607-9445-900125b3eaea")
                .setIssuedAt(Date.from(Instant.ofEpochSecond(1510211926)))
                .setExpiration(Date.from(Instant.ofEpochSecond(1510215526)))
                .claim("name", "John Doe")
                .claim("admin", true)
                .signWith(SignatureAlgorithm.HS256, "secret".getBytes("UTF-8"))
                .compact();
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }

    System.out.println(s);
}
}
