package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDiscente is a Querydsl query type for Discente
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDiscente extends EntityPathBase<Discente> {

    private static final long serialVersionUID = -2062237179L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDiscente discente = new QDiscente("discente");

    public final QUsuario _super;

    //inherited
    public final BooleanPath ativo;

    //inherited
    public final StringPath cpfCnpj;

    public final QCurso curso;

    //inherited
    public final DateTimePath<java.util.Date> dataAtualizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataCriacao;

    public final DatePath<java.time.LocalDate> dataIngresso = createDate("dataIngresso", java.time.LocalDate.class);

    // inherited
    public final QEndereco endereco;

    //inherited
    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath nacionalidade;

    //inherited
    public final StringPath nome;

    public final StringPath rga = createString("rga");

    //inherited
    public final NumberPath<Integer> rgNumero;

    //inherited
    public final StringPath rgOrgaoExpedidor;

    //inherited
    public final StringPath senha;

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoUsuario> tipoUsuario;

    public QDiscente(String variable) {
        this(Discente.class, forVariable(variable), INITS);
    }

    public QDiscente(Path<? extends Discente> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDiscente(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDiscente(PathMetadata<?> metadata, PathInits inits) {
        this(Discente.class, metadata, inits);
    }

    public QDiscente(Class<? extends Discente> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QUsuario(type, metadata, inits);
        this.ativo = _super.ativo;
        this.cpfCnpj = _super.cpfCnpj;
        this.curso = inits.isInitialized("curso") ? new QCurso(forProperty("curso"), inits.get("curso")) : null;
        this.dataAtualizacao = _super.dataAtualizacao;
        this.dataCriacao = _super.dataCriacao;
        this.endereco = _super.endereco;
        this.enderecosEletronicos = _super.enderecosEletronicos;
        this.id = _super.id;
        this.nacionalidade = _super.nacionalidade;
        this.nome = _super.nome;
        this.rgNumero = _super.rgNumero;
        this.rgOrgaoExpedidor = _super.rgOrgaoExpedidor;
        this.senha = _super.senha;
        this.telefones = _super.telefones;
        this.tipoPessoa = _super.tipoPessoa;
        this.tipoUsuario = _super.tipoUsuario;
    }

}

