package skaro.pokeapi.utils.locale;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import skaro.pokeapi.resource.Name;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
class PokeApiLocaleUtilsTest {

    @Test
    void getInLocaleTest_localeExists() {
        String locale = "foo";
        Localizable localizable = Mockito.mock(Localizable.class);
        Name localizedName = Mockito.mock(Name.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(localizable.getNames())
                .thenReturn(List.of(localizedName));
        Mockito.when(localizedName.getLanguage().getName())
                .thenReturn(locale);

        Optional<Name> result = PokeApiLocaleUtils.getInLocale(localizable, locale);

        assertTrue(result.isPresent());
        assertEquals(localizedName, result.get());
    }

    @Test
    void getInLocaleTest_localeMissing() {
        String locale = "bar";
        Localizable localizable = Mockito.mock(Localizable.class);

        Mockito.when(localizable.getNames())
                .thenReturn(List.of());

        Optional<Name> result = PokeApiLocaleUtils.getInLocale(localizable, locale);

        assertTrue(result.isEmpty());
    }

}
