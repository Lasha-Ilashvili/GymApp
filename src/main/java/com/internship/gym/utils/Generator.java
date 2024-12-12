package com.internship.gym.utils;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Generator {
    private static final Map<String, Integer> userNames = new HashMap<>();
    private static final String PASSWORD_CHARACTERS = "[A-Za-z0-9]";
    private static final int PASSWORD_LENGTH = 10;

    public static String generateUsername(String firstName, String lastName) {
        String baseUsername = firstName + "." + lastName;
        userNames.put(baseUsername, userNames.getOrDefault(baseUsername, 0) + 1);
        int count = userNames.get(baseUsername);

        return count > 1 ? baseUsername + count : baseUsername;
    }

    public static String generatePassword() {
        SecureRandom random = new SecureRandom();

        return IntStream.range(0, PASSWORD_LENGTH)
                .mapToObj(i -> {
                    char c;
                    do {
                        c = (char) (random.nextInt(126 - 33 + 1) + 33);
                    } while (!Character.toString(c).matches(PASSWORD_CHARACTERS));
                    return c;
                })
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
