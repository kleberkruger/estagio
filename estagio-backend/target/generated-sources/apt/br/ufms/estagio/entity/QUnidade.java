package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUnidade is a Querydsl query type for Unidade
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUnidade extends EntityPathBase<Unidade> {

    private static final long serialVersionUID = 1438789080L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUnidade unidade = new QUnidade("unidade");

    public final QPessoaJuridica _super;

    //inherited
    public final StringPath cpfCnpj;

    //inherited
    public final DateTimePath<java.util.Date> dataAtualizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataCriacao;

    // inherited
    public final QEndereco endereco;

    //inherited
    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath nome;

    //inherited
    public final StringPath razaoSocial;

    public final QDocente responsavel;

    public final StringPath sigla = createString("sigla");

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    public QUnidade(String variable) {
        this(Unidade.class, forVariable(variable), INITS);
    }

    public QUnidade(Path<? extends Unidade> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUnidade(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUnidade(PathMetadata<?> metadata, PathInits inits) {
        this(Unidade.class, metadata, inits);
    }

    public QUnidade(Class<? extends Unidade> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QPessoaJuridica(type, metadata, inits);
        this.cpfCnpj = _super.cpfCnpj;
        this.dataAtualizacao = _super.dataAtualizacao;
        this.dataCriacao = _super.dataCriacao;
        this.endereco = _super.endereco;
        this.enderecosEletronicos = _super.enderecosEletronicos;
        this.id = _super.id;
        this.nome = _super.nome;
        this.razaoSocial = _super.razaoSocial;
        this.responsavel = inits.isInitialized("responsavel") ? new QDocente(forProperty("responsavel"), inits.get("responsavel")) : null;
        this.telefones = _super.telefones;
        this.tipoPessoa = _super.tipoPessoa;
    }

}

