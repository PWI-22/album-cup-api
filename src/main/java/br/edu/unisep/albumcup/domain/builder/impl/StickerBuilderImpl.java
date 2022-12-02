package br.edu.unisep.albumcup.domain.builder.impl;

import br.edu.unisep.albumcup.data.entity.Player;
import br.edu.unisep.albumcup.data.entity.Sticker;
import br.edu.unisep.albumcup.domain.builder.StickerBuilder;
import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StickerBuilderImpl implements StickerBuilder {
    @Override
    public Sticker build(CreateStickerDto stickerData) {
        var sticker = new Sticker();
        sticker.setLegendary(stickerData.isLegendary());

        var player = new Player();
        player.setId(stickerData.getPlayerId());

        sticker.setPlayer(player);

        return sticker;
    }

    @Override
    public ListStickerItemDto build(Sticker sticker) {
        var dto = new ListStickerItemDto();
        dto.setId(sticker.getId());
        dto.setLegendary(sticker.isLegendary());

        var player = sticker.getPlayer();
        dto.setBirthday(player.getBirthday());
        dto.setHeight(player.getHeight());
        dto.setWeight(player.getWeight());
        dto.setPlayer(player.getName());
        dto.setCountry(player.getCountry().getName());

        return dto;
    }

    @Override
    public List<ListStickerItemDto> build(List<Sticker> stickers) {
        return stickers.stream().map(this::build).toList();
    }
}
