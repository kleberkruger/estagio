import { Observable } from 'rxjs/Observable';
import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

import { Telefone, UsoTelefone } from './telefone-form/telefone';

@Component({
  selector: 'app-telefones',
  templateUrl: './telefones.component.html',
  styleUrls: ['./telefones.component.scss']
})
export class TelefonesComponent implements OnInit {

  // private telefones: any = [
  //   {
  //     id: 1,
  //     uso: UsoTelefone.Pessoal,
  //     contato: null,
  //     numero: '67998836289',
  //     ramal: null,
  //     operadora: 'Vivo',
  //     isWhatsApp: true,
  //     prioridade: 0
  //   },
  //   {
  //     id: 2,
  //     uso: UsoTelefone.Pessoal,
  //     contato: null,
  //     numero: '6732911828',
  //     ramal: null,
  //     operadora: 'Oi',
  //     isWhatsApp: null,
  //     prioridade: 1
  //   },
  //   {
  //     id: 3,
  //     uso: UsoTelefone.Trabalho,
  //     contato: null,
  //     numero: '6732910200',
  //     ramal: 201,
  //     operadora: null,
  //     isWhatsApp: null,
  //     prioridade: 2
  //   },
  //   {
  //     id: 4,
  //     uso: UsoTelefone.Recado,
  //     contato: 'Ekler',
  //     numero: '67999999907',
  //     ramal: null,
  //     operadora: 'Vivo',
  //     isWhatsApp: true,
  //     prioridade: 3
  //   }
  // ];

  telefones: Telefone[];

  constructor(private _http: Http) { }

  ngOnInit() {
    this.getTelefones()
      .subscribe(x => this.telefones = x);
  }

  private adicionar() {
    var t: Telefone = new Telefone();
    this.telefones.push(t);
  }

  private getTelefones(): Observable<Telefone[]> {
    const url = 'assets/mock-telefones.json';
    return this._http.get(url)
      .map(x => x.json());
  }

}
