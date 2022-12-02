package br.edu.unisep.albumcup.domain.builder;

import br.edu.unisep.albumcup.data.entity.Sticker;
import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;

import java.util.List;

public interface StickerBuilder {
    Sticker build(CreateStickerDto dto);
    ListStickerItemDto build(Sticker sticker);
    List<ListStickerItemDto> build(List<Sticker> sticker);
}
