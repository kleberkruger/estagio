import { User } from './../../modelos/user-modelo';

import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
@Injectable()
export class LoginService {
    constructor(private http: Http) { }

    logar(passaporte: string, senha: string): Observable<any> {
        var headers = new Headers();
        headers.append('Content-Type', 'application/json');
        let bodyString = JSON.stringify({"passaporte":passaporte,"senha":senha})
        let options = new RequestOptions({ headers:headers});
        return this.http.post('https://sistemas5.ufms.br/seguranca/rest/authentication',bodyString,options)
            .map((response: Response) => {
                let body = response.json();
                if (body) {
                        localStorage.setItem('currentUser', JSON.stringify(body));
                 }
            });
    }

    create(user: User){
        console.log("AQUI PORA", user);
        return this.http.post('http://localhost:3000/api/usuario/save', user).map((response: Response) => response.json());
    }


    logout() {
        localStorage.removeItem('currentUser');
    }
}