package com.ohgiraffers.section02.annotation.qualifier;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    private final Pokemon pokemon;

    /* @Qualifier 어노테이션은 특정 빈 객체를 이름으로 지정하는 어노테이션이다.
    * @Primary 어노테이션과 함께 쓰였을 때 @Qualifier가 우선한다.
    * */
    @Autowired
    public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
