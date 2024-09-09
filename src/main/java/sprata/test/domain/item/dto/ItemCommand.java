package sprata.test.domain.item.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sprata.test.domain.item.Item;

public class ItemCommand {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Create {
        private String username;
        private String title;
        private String content;
        private int price;

        public Item toEntity() {
            return Item.builder()
                    .username(username)
                    .title(title)
                    .content(content)
                    .price(price)
                    .build();
        }
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Put {

        private String title;
        private String content;
        private int price;
        private String username;

        public Item toEntity() {
            return Item.builder()
                    .username(username)
                    .title(title)
                    .content(content)
                    .price(price)
                    .build();
        }
    }
}
