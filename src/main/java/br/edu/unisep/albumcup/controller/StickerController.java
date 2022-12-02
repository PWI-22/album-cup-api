package br.edu.unisep.albumcup.controller;

import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;
import br.edu.unisep.albumcup.domain.usecase.CreateStickerUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindAllStickersUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindLegendaryStickersUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindStickersByCountryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sticker")
@RequiredArgsConstructor
public class StickerController {

    private final CreateStickerUseCase createStickerUseCase;
    private final FindAllStickersUseCase findAllStickersUseCase;
    private final FindLegendaryStickersUseCase findLegendaryStickersUseCase;
    private final FindStickersByCountryUseCase findStickersByCountryUseCase;

    @PostMapping
    public ResponseEntity save(@RequestBody CreateStickerDto stickerData) {
        createStickerUseCase.execute(stickerData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<ListStickerItemDto>> findAll() {
        var result = findAllStickersUseCase.execute();

        if (result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/legendary")
    public ResponseEntity<List<ListStickerItemDto>> findAllLegendary() {
        var result = findLegendaryStickersUseCase.execute();

        if (result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/country/{countryId}")
    public ResponseEntity<List<ListStickerItemDto>> findByCountry(
            @PathVariable("countryId") Integer countryId) {

        var result = findStickersByCountryUseCase.execute(countryId);

        if (result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(result);
    }
}
