package org.song.globle.libs;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class Utils {
    private final MessageSource source;
    private final HttpServletRequest request;
    private final LocaleResolver resolver;

    public String getMessage(String code){
        Locale locale =  resolver.resolveLocale(request);
        return source.getMessage(code, null, locale);
    }
}
