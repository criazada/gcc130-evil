{
  inputs = {
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils, ... }:
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = import nixpkgs {
          inherit system;
        };

        antlr = pkgs.antlr.override {
          jre = pkgs.jre;
        };
        buildInputs = with pkgs; [ antlr jdk ];
        nativeBuildInputs = with pkgs; [ ];
      in
      rec {
        devShell = pkgs.mkShell {
          inherit buildInputs nativeBuildInputs;
        };
      });
}
