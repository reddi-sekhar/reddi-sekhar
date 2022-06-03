//
// COPYRIGHT (C) NEC CORPORATION
//
// ALL RIGHTS RESERVED BY NEC NEC CORPORATION, THIS PROGRAM
// MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
// FURNISHED BY NEC NEC CORPORATION, NO PART OF THIS PROGRAM
// MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
// WITHOUT THE PRIOR WRITTEN PERMISSION OF NEC NEC CORPORATION.
//
// NEC CORPORATION CONFIDENTIAL AND PROPRIETARY
package jp.co.ana.cas.resources.handler;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * API エラー発生時のレスポンス情報を格納する DTO 。
 *
 */
@Data
@ToString(onlyExplicitlyIncluded = true) // ログ出力対象フィールドを @ToString.Include で明示的に指定させる
public class ErrorDto {

    /** エラーメッセージ */
    @ToString.Include
    private List<String> messages = new ArrayList<String>(0);

    /**
     * エラーメッセージを追加します。
     * 
     * @param message エラーメッセージ。
     */
    public void addMessage(String message) {
        this.messages.add(message);
    }

}
