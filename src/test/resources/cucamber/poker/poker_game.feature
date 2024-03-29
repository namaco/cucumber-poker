# language: ja
フィーチャ: ポーカーゲーム
  シナリオテンプレート: ノーチェンジの場合
    前提 手札に<手札>が配られた
    もし チェンジしない
    ならば <役>であるべき

  例:
    | 手札           | 役         |
    | S1,H4,D6,D8,C3 | ノーペア    |
    | S1,S2,S3,S4,C9 | ノーペア    |
    | H1,H4,D2,D8,D9 | ノーペア    |
    | H1,H4,D1,D8,D9 | 1のワンペア |
    | H3,H9,D1,D8,D9 | 9のワンペア |
