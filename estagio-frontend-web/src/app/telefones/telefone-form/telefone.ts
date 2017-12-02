export enum UsoTelefone {
    Pessoal, 
    Trabalho, 
    Recado
}

export class Telefone {

    private _id: number;
    // private _uso: UsoTelefone;
    private _uso: string;
    private _contato: string;
    private _numero: string;
    private _ramal: string;
    private _operadora: string;
    private _isWhatsApp: boolean;
    private _prioridade: number;

    public isCelular(): boolean {
        return (this.numero.length == 11 && this.numero[0] == '9');
    }

    public isValido(): boolean {
        return true;
    }

    get id(): number { return this._id; }
    set id(id: number) { this._id = id; }

    // get uso(): UsoTelefone { return this._uso; }
    // set uso(uso: UsoTelefone) { this._uso = uso; }

    // get contato(): string { return this.uso == UsoTelefone.Recado ? this._contato : null; }
    // set contato(contato: string) { this._contato = contato; }

    get uso(): string { return this._uso; }
    set uso(uso: string) { this._uso = uso; }

    get contato(): string { return this.uso === 'Recado' ? this._contato : null; }
    set contato(contato: string) { this._contato = contato; }

    get numero(): string { return this._numero; }
    set numero(numero: string) { this._numero = numero; }

    get ramal(): string { return !this.isCelular() ? this._ramal : null; }
    set ramal(ramal: string) { this._ramal = ramal; }

    get operadora(): string { return this._operadora; }
    set operadora(operadora: string) { this._operadora = operadora; }

    get isWhatsApp(): boolean { return this.isCelular() ? this._isWhatsApp : false; }
    set isWhatsApp(isWhatsApp: boolean) { this._isWhatsApp = isWhatsApp; }

    get prioridade(): number { return this._prioridade; }
    set prioridade(prioridade: number) { this._prioridade = prioridade; }
}

// export interface Telefone {
//     id: number;
//     uso: string;
//     contato: string;
//     numero: string;
//     ramal: string;
//     operadora: string;
//     isWhatsApp: boolean;
//     prioridade: number;
// }